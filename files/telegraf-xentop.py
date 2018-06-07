#!/usr/bin/env python
# Author: Ernestas Lukosevicius <ernetas@gmail.com>
import socket
hostname = socket.gethostname()
import subprocess
import time
 
def print_influx_data(xendomain, value):
  global timestamp
  print('xen' + ',domain=' + xendomain + ',host=' + hostname + ' ' + value + ' ' + timestamp)
 
 
def get_xentop_lines():
  # Using -i1 does not show correct CPU usage
  # Since collecting data is slow, we must run xentop only once and collect all the needed data from one run
  p = subprocess.Popen(['xentop', '-b', '-f', '-i2', '-d1'], stdout=subprocess.PIPE)
  out, _ = p.communicate()
  out = out.decode('utf-8')
  # Ignore the first iteration, as data there is not correct (e.g. CPU usage 0%)
  # Start reading lines only after second line starting with 'NAME' (second iteration)
  iteration = 0
  xentop = []
  for line in out.splitlines():
    if iteration < 2 and line.strip().startswith('NAME'):
      iteration += 1
    elif iteration == 2 and not line.strip().startswith('NAME'):
      xentop.append(line.strip())
  return xentop
 
xentop_lines = get_xentop_lines()
#timestamp = str("%.20f" % time.time()).replace('.', '') # A little bit more exact than doing this for each xentop line
timestamp =  str(int(time.time() * 1000000000))
 
for line in xentop_lines:
  domain = line.replace('no limit', 'nolimit').split()
  print_influx_data(domain[0],'cpu_usage_%=' + domain[3])
  print_influx_data(domain[0],'mem_usage_%=' + domain[5])
  print_influx_data(domain[0],'vcpus=' + domain[8])
  print_influx_data(domain[0],'mem_size_KB=' + domain[4])
  print_influx_data(domain[0],'nettx_KB=' + domain[10])
  print_influx_data(domain[0],'netrx_KB=' + domain[11])
  print_influx_data(domain[0],'disk_rd_request=' + domain[14])
  print_influx_data(domain[0],'disk_wr_request=' + domain[15])
