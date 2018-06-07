DESCRIPTION = "github.com/influxdata/telegraf"

PV = "1.6"
PR = "1"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=10a23e7a514f23f0930e1a4254936534"

inherit go systemd

RDEPENDS_${PN} += "bash \
                   python \
                   "

GO_IMPORT = "github.com/influxdata/telegraf"
GO_IMPORT_1 = "code.cloudfoundry.org/clock"
GO_IMPORT_2 = "collectd.org"
GO_IMPORT_3 = "github.com/aerospike/aerospike-client-go"
GO_IMPORT_4 = "github.com/amir/raidman"
GO_IMPORT_5 = "github.com/apache/thrift"
GO_IMPORT_6 = "github.com/aws/aws-sdk-go"
GO_IMPORT_7 = "github.com/beorn7/perks"
GO_IMPORT_8 = "github.com/bsm/sarama-cluster"
GO_IMPORT_9 = "github.com/cenkalti/backoff"
GO_IMPORT_10 = "github.com/couchbase/go-couchbase"
GO_IMPORT_11 = "github.com/couchbase/gomemcached"
GO_IMPORT_12 = "github.com/couchbase/goutils"
GO_IMPORT_13 = "github.com/davecgh/go-spew"
GO_IMPORT_14 = "github.com/dgrijalva/jwt-go"
GO_IMPORT_15 = "github.com/docker/docker"
GO_IMPORT_16 = "github.com/docker/go-connections"
GO_IMPORT_17 = "github.com/eapache/go-resiliency"
GO_IMPORT_18 = "github.com/eapache/go-xerial-snappy"
GO_IMPORT_19 = "github.com/eapache/queue"
GO_IMPORT_20 = "github.com/eclipse/paho.mqtt.golang"
GO_IMPORT_21 = "github.com/go-logfmt/logfmt"
GO_IMPORT_22 = "github.com/go-sql-driver/mysql"
GO_IMPORT_23 = "github.com/gobwas/glob"
GO_IMPORT_24 = "github.com/go-ini/ini"
GO_IMPORT_25 = "github.com/gogo/protobuf"
GO_IMPORT_26 = "github.com/golang/protobuf"
GO_IMPORT_27 = "github.com/golang/snappy"
GO_IMPORT_28 = "github.com/go-ole/go-ole"
GO_IMPORT_29 = "github.com/google/go-cmp"
GO_IMPORT_30 = "github.com/gorilla/mux"
GO_IMPORT_31 = "github.com/go-redis/redis"
GO_IMPORT_32 = "github.com/golang/lint/golint"
GO_IMPORT_33 = "github.com/hailocab/go-hostpool"
GO_IMPORT_34 = "github.com/hashicorp/consul"
GO_IMPORT_35 = "github.com/influxdata/go-syslog"
GO_IMPORT_36 = "github.com/influxdata/tail"
GO_IMPORT_37 = "github.com/influxdata/toml"
GO_IMPORT_38 = "github.com/influxdata/wlog"
GO_IMPORT_39 = "github.com/fsnotify/fsnotify"
GO_IMPORT_40 = "github.com/jackc/pgx"
GO_IMPORT_41 = "github.com/jmespath/go-jmespath"
GO_IMPORT_42 = "github.com/kardianos/osext"
GO_IMPORT_43 = "github.com/kardianos/service"
GO_IMPORT_44 = "github.com/kballard/go-shellquote"
GO_IMPORT_45 = "github.com/matttproud/golang_protobuf_extensions"
GO_IMPORT_46 = "github.com/Microsoft/ApplicationInsights-Go"
GO_IMPORT_47 = "github.com/Microsoft/go-winio"
GO_IMPORT_48 = "github.com/miekg/dns"
GO_IMPORT_49 = "github.com/mitchellh/mapstructure"
GO_IMPORT_50 = "github.com/multiplay/go-ts3"
GO_IMPORT_51 = "github.com/naoina/go-stringutil"
GO_IMPORT_52 = "github.com/nats-io/gnatsd"
GO_IMPORT_53 = "github.com/nats-io/go-nats"
GO_IMPORT_54 = "github.com/nats-io/nats"
GO_IMPORT_55 = "github.com/nats-io/nuid"
GO_IMPORT_56 = "github.com/nsqio/go-nsq"
GO_IMPORT_57 = "github.com/opencontainers/runc"
GO_IMPORT_58 = "github.com/opentracing-contrib/go-observer"
GO_IMPORT_59 = "github.com/opentracing/opentracing-go"
GO_IMPORT_60 = "github.com/openzipkin/zipkin-go-opentracing"
GO_IMPORT_61 = "github.com/pierrec/lz4"
GO_IMPORT_62 = "github.com/pierrec/xxHash"
GO_IMPORT_63 = "github.com/pkg/errors"
GO_IMPORT_64 = "github.com/pmezard/go-difflib/difflib"
GO_IMPORT_65 = "github.com/prometheus/client_golang"
GO_IMPORT_66 = "github.com/prometheus/client_model"
GO_IMPORT_67 = "github.com/prometheus/common"
GO_IMPORT_68 = "github.com/prometheus/procfs"
GO_IMPORT_69 = "github.com/rcrowley/go-metrics"
GO_IMPORT_70 = "github.com/samuel/go-zookeeper"
GO_IMPORT_71 = "github.com/satori/go.uuid"
GO_IMPORT_72 = "github.com/shirou/gopsutil"
GO_IMPORT_73 = "github.com/shirou/w32"
GO_IMPORT_74 = "github.com/Shopify/sarama"
GO_IMPORT_75 = "github.com/Sirupsen/logrus"
GO_IMPORT_76 = "github.com/soniah/gosnmp"
GO_IMPORT_77 = "github.com/StackExchange/wmi"
GO_IMPORT_78 = "github.com/streadway/amqp"
GO_IMPORT_79 = "github.com/stretchr/objx"
GO_IMPORT_80 = "github.com/stretchr/testify"
GO_IMPORT_81 = "github.com/tidwall/gjson"
GO_IMPORT_82 = "github.com/tidwall/match"
GO_IMPORT_83 = "github.com/vjeantet/grok"
GO_IMPORT_84 = "github.com/wvanbergen/kafka"
GO_IMPORT_85 = "github.com/wvanbergen/kazoo-go"
GO_IMPORT_86 = "github.com/yuin/gopher-lua"
GO_IMPORT_87 = "github.com/zensqlmonitor/go-mssqldb"
GO_IMPORT_88 = "golang.org/x/crypto"
GO_IMPORT_89 = "golang.org/x/net"
GO_IMPORT_90 = "golang.org/x/sys"
GO_IMPORT_91 = "golang.org/x/text"
GO_IMPORT_92 = "google.golang.org/genproto"
GO_IMPORT_93 = "google.golang.org/grpc"
GO_IMPORT_94 = "gopkg.in/asn1-ber.v1"
GO_IMPORT_95 = "gopkg.in/fatih/pool.v2"
GO_IMPORT_96 = "gopkg.in/gorethink/gorethink.v3"
GO_IMPORT_97 = "gopkg.in/ldap.v2"
GO_IMPORT_98 = "gopkg.in/mgo.v2"
GO_IMPORT_99 = "gopkg.in/olivere/elastic.v5"
GO_IMPORT_100 = "gopkg.in/tomb.v1"
GO_IMPORT_101 = "gopkg.in/yaml.v2"

SRC_URI = "git://github.com/influxdata/telegraf;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT};rev=b24e8648f093dfc97b643fc70e3d9ceda460db9d;branch=release-1.6 \
           git://github.com/cloudfoundry/clock;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT_1};rev=e9dc86bbf0e5bbe6bf7ff5a6f71e048959b61f71 \
           git://github.com/collectd/go-collectd;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT_2};rev=2ce144541b8903101fb8f1483cc0497a68798122 \
           git://github.com/aerospike/aerospike-client-go;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT_3};rev=95e1ad7791bdbca44707fedbb29be42024900d9c\
           git://github.com/amir/raidman;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT_4};rev=c74861fe6a7bb8ede0a010ce4485bdbb4fc4c985 \
           git://github.com/apache/thrift;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT_5};rev=4aaa92ece8503a6da9bc6701604f69acf2b99d07 \
           git://github.com/aws/aws-sdk-go;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT_6};rev=c861d27d0304a79f727e9a8a4e2ac1e74602fdc0 \
           git://github.com/beorn7/perks;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT_7};rev=4c0e84591b9aa9e6dcfdf3e020114cd81f89d5f9 \
           git://github.com/bsm/sarama-cluster;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT_8};rev=abf039439f66c1ce78017f560b490612552f6472 \
           git://github.com/cenkalti/backoff;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT_9};rev=b02f2bbce11d7ea6b97f282ef1771b0fe2f65ef3 \
           git://github.com/couchbase/go-couchbase;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT_10};rev=bfe555a140d53dc1adf390f1a1d4b0fd4ceadb28 \
           git://github.com/couchbase/gomemcached;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT_11};rev=4a25d2f4e1dea9ea7dd76dfd943407abf9b07d29 \
           git://github.com/couchbase/goutils;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT_12};rev=5823a0cbaaa9008406021dc5daf80125ea30bba6 \
           git://github.com/davecgh/go-spew;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT_13};rev=346938d642f2ec3594ed81d874461961cd0faa76 \
           git://github.com/dgrijalva/jwt-go;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT_14};rev=dbeaa9332f19a944acb5736b4456cfcc02140e29 \
           git://github.com/moby/moby;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT_15};rev=f5ec1e2936dcbe7b5001c2b817188b095c700c27;branch=17.03.x \
           git://github.com/docker/go-connections;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT_16};rev=990a1a1a70b0da4c4cb70e117971a4f0babfbf1a \
           git://github.com/eapache/go-resiliency;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT_17};rev=b86b1ec0dd4209a588dc1285cdd471e73525c0b3 \
           git://github.com/eapache/go-xerial-snappy;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT_18};rev=bb955e01b9346ac19dc29eb16586c90ded99a98c \
           git://github.com/eapache/queue;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT_19};rev=44cc805cf13205b55f69e14bcb69867d1ae92f98 \
           git://github.com/eclipse/paho.mqtt.golang;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT_20};rev=aff15770515e3c57fc6109da73d42b0d46f7f483 \
           git://github.com/go-logfmt/logfmt;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT_21};rev=390ab7935ee28ec6b286364bba9b4dd6410cb3d5 \
           git://github.com/go-sql-driver/mysql;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT_22};rev=2e00b5cd70399450106cec6431c2e2ce3cae5034 \
           git://github.com/gobwas/glob;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT_23};rev=bea32b9cd2d6f55753d94a28e959b13f0244797a \
           git://github.com/go-ini/ini;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT_24};rev=9144852efba7c4daf409943ee90767da62d55438 \
           git://github.com/gogo/protobuf;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT_25};rev=7b6c6391c4ff245962047fc1e2c6e08b1cdfa0e8 \
           git://github.com/golang/protobuf;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT_26};rev=8ee79997227bf9b34611aee7946ae64735e6fd93 \
           git://github.com/golang/snappy;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT_27};rev=7db9049039a047d955fe8c19b83c8ff5abd765c7 \
           git://github.com/go-ole/go-ole;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT_28};rev=be49f7c07711fcb603cff39e1de7c67926dc0ba7 \
           git://github.com/google/go-cmp;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT_29};rev=f94e52cad91c65a63acc1e75d4be223ea22e99bc \
           git://github.com/gorilla/mux;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT_30};rev=53c1911da2b537f792e7cafcb446b05ffe33b996 \
           git://github.com/go-redis/redis;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT_31};rev=73b70592cdaa9e6abdfcfbf97b4a90d80728c836 \
           git://github.com/golang/lint;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT_32};rev=470b6b0bb3005eda157f0275e2e4895055396a81 \
           git://github.com/hailocab/go-hostpool;progithub.com/jmespath/go-jmespathtocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT_33};rev=e80d13ce29ede4452c43dea11e79b9bc8a15b478 \
           git://github.com/hashicorp/consul;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT_34};rev=5174058f0d2bda63fa5198ab96c33d9a909c58ed \
           git://github.com/influxdata/go-syslog;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT_35};rev=84f3b60009444d298f97454feb1f20cf91d1fa6e;branch=develop \
           git://github.com/influxdata/tail;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT_36};rev=c43482518d410361b6c383d7aebce33d0471d7bc \
           git://github.com/influxdata/toml;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT_37};rev=5d1d907f22ead1cd47adde17ceec5bda9cacaf8f \
           git://github.com/influxdata/wlog;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT_38};rev=7c63b0a71ef8300adc255344d275e10e5c3a71ec \
           git://github.com/fsnotify/fsnotify;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT_39};rev=c2828203cd70a50dcccfb2761f8b1f8ceef9a8e9 \
           git://github.com/jackc/pgx;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT_40};rev=63f58fd32edb5684b9e9f4cfaac847c6b42b3917 \
           git://github.com/jmespath/go-jmespath;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT_41};rev=bd40a432e4c76585ef6b72d3fd96fb9b6dc7b68d \
           git://github.com/kardianos/osext;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT_42};rev=c2c54e542fb797ad986b31721e1baedf214ca413 \
           git://github.com/kardianos/service;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT_43};rev=6d3a0ee7d3425d9d835debc51a0ca1ffa28f4893 \
           git://github.com/kballard/go-shellquote;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT_44};rev=d8ec1a69a250a17bb0e419c386eac1f3711dc142 \
           git://github.com/matttproud/golang_protobuf_extensions;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT_45};rev=c12348ce28de40eed0136aa2b644d0ee0650e56c \
           git://github.com/Microsoft/ApplicationInsights-Go;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT_46};rev=3612f58550c1de70f1a110c78c830e55f29aa65d \
           git://github.com/Microsoft/go-winio;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT_47};rev=ce2922f643c8fd76b46cadc7f404a06282678b34 \
           git://github.com/miekg/dns;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT_48};rev=99f84ae56e75126dd77e5de4fae2ea034a468ca1 \
           git://github.com/mitchellh/mapstructure;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT_49};rev=d0303fe809921458f417bcf828397a65db30a7e4 \
           git://github.com/multiplay/go-ts3;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT_50};rev=07477f49b8dfa3ada231afc7b7b17617d42afe8e \
           git://github.com/naoina/go-stringutil;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT_51};rev=6b638e95a32d0c1131db0e7fe83775cbea4a0d0b \
           git://github.com/nats-io/gnatsd;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT_52};rev=393bbb7c031433e68707c8810fda0bfcfbe6ab9b \
           git://github.com/nats-io/go-nats;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT_53};rev=ea9585611a4ab58a205b9b125ebd74c389a6b898 \
           git://github.com/nats-io/nats;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT_54};rev=ea9585611a4ab58a205b9b125ebd74c389a6b898 \
           git://github.com/nats-io/nuid;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT_55};rev=289cccf02c178dc782430d534e3c1f5b72af807f \
           git://github.com/nsqio/go-nsq;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT_56};rev=eee57a3ac4174c55924125bb15eeeda8cffb6e6f \
           git://github.com/opencontainers/runc;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT_57};rev=89ab7f2ccc1e45ddf6485eaa802c35dcf321dfc8 \
           git://github.com/opentracing-contrib/go-observer;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT_58};rev=a52f2342449246d5bcc273e65cbdcfa5f7d6c63c \
           git://github.com/opentracing/opentracing-go;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT_59};rev=06f47b42c792fef2796e9681353e1d908c417827 \
           git://github.com/openzipkin/zipkin-go-opentracing;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT_60};rev=1cafbdfde94fbf2b373534764e0863aa3bd0bf7b \
           git://github.com/pierrec/lz4;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT_61};rev=5c9560bfa9ace2bf86080bf40d46b34ae44604df \
           git://github.com/pierrec/xxHash;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT_62};rev=5a004441f897722c627870a981d02b29924215fa \
           git://github.com/pkg/errors;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT_63};rev=645ef00459ed84a119197bfb8d8205042c6df63d \
           git://github.com/pmezard/go-difflib;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT_64};rev=792786c7400a136282c1664665ae0a8db921c6c2 \
           git://github.com/prometheus/client_golang;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT_65};rev=c317fb74746eac4fc65fe3909195f4cf67c5562a \
           git://github.com/prometheus/client_model;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT_66};rev=fa8ad6fec33561be4280a8f0514318c79d7f6cb6 \
           git://github.com/prometheus/common;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT_67};rev=dd2f054febf4a6c00f2343686efb775948a8bff4 \
           git://github.com/prometheus/procfs;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT_68};rev=1878d9fbb537119d24b21ca07effd591627cd160 \
           git://github.com/rcrowley/go-metrics;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT_69};rev=1f30fe9094a513ce4c700b9a54458bbb0c96996c \
           git://github.com/samuel/go-zookeeper;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT_70};rev=1d7be4effb13d2d908342d349d71a284a7542693 \
           git://github.com/satori/go.uuid;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT_71};rev=5bf94b69c6b68ee1b541973bb8e1144db23a194b \
           git://github.com/shirou/gopsutil;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT_72};rev=c95755e4bcd7a62bb8bd33f3a597a7c7f35e2cf3 \
           git://github.com/shirou/w32;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT_73};rev=3c9377fc6748f222729a8270fe2775d149a249ad \
           git://github.com/Shopify/sarama;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT_74};rev=3b1b38866a79f06deddf0487d5c27ba0697ccd65 \
           git://github.com/Sirupsen/logrus;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT_75};rev=61e43dc76f7ee59a82bdf3d71033dc12bea4c77d \
           git://github.com/soniah/gosnmp;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT_76};rev=f15472a4cd6f6ea7929e4c7d9f163c49f059924f \
           git://github.com/StackExchange/wmi;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT_77};rev=f3e2bae1e0cb5aef83e319133eabfee30013a4a5 \
           git://github.com/streadway/amqp;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT_78};rev=63795daa9a446c920826655f26ba31c81c860fd6 \
           git://github.com/stretchr/objx;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT_79};rev=facf9a85c22f48d2f52f2380e4efce1768749a89 \
           git://github.com/stretchr/testify;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT_80};rev=12b6f73e6084dad08a7c6e575284b177ecafbc71 \
           git://github.com/tidwall/gjson;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT_81};rev=0623bd8fbdbf97cc62b98d15108832851a658e59 \
           git://github.com/tidwall/match;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT_82};rev=173748da739a410c5b0b813b956f89ff94730b4c \
           git://github.com/vjeantet/grok;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT_83};rev=d73e972b60935c7fec0b4ffbc904ed39ecaf7efe \
           git://github.com/wvanbergen/kafka;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT_84};rev=bc265fedb9ff5b5c5d3c0fdcef4a819b3523d3ee \
           git://github.com/wvanbergen/kazoo-go;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT_85};rev=968957352185472eacb69215fa3dbfcfdbac1096 \
           git://github.com/yuin/gopher-lua;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT_86};rev=66c871e454fcf10251c61bf8eff02d0978cae75a \
           git://github.com/zensqlmonitor/go-mssqldb;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT_87};rev=ffe5510c6fa5e15e6d983210ab501c815b56b363 \
           git://github.com/golang/crypto;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT_88};rev=dc137beb6cce2043eb6b5f223ab8bf51c32459f4 \
           git://github.com/golang/net;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT_89};rev=a337091b0525af65de94df2eb7e98bd9962dcbe2 \
           git://github.com/golang/sys;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT_90};rev=739734461d1c916b6c72a63d7efda2b27edb369f \
           git://github.com/golang/text;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT_91};rev=506f9d5c962f284575e88337e7d9296d27e729d3 \
           git://github.com/google/go-genproto;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT_92};rev=11c7f9e547da6db876260ce49ea7536985904c9b \
           git://github.com/grpc/grpc-go;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT_93};rev=de2209a968d48e8970546c8a710189f7461370f7 \
           git://gopkg.in/asn1-ber.v1;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT_94};rev=4e86f4367175e39f69d9358a5f17b4dda270378d \
           git://gopkg.in/fatih/pool.v2;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT_95};rev=6e328e67893eb46323ad06f0e92cb9536babbabc \
           git://gopkg.in/gorethink/gorethink.v3;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT_96};rev=7ab832f7b65573104a555d84a27992ae9ea1f659 \
           git://gopkg.in/ldap.v2;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT_97};rev=8168ee085ee43257585e50c6441aadf54ecb2c9f \
           git://gopkg.in/mgo.v2;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT_98};rev=3f83fa5005286a7fe593b055f0d7771a7dce4655 \
           git://gopkg.in/olivere/elastic.v5;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT_99};rev=3113f9b9ad37509fe5f8a0e5e91c96fdc4435e26 \
           git://gopkg.in/tomb.v1;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT_100};rev=dd632973f1e7218eb1089048e0798ec9ae7dceb8 \
           git://gopkg.in/yaml.v2;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT_101};rev=4c78c975fe7c825c6d1466c42be594d1d6f3aba6 \
           file://telegraf.conf \
           file://telegraf-xentop.py \
"

INSANE_SKIP_${PN} = "ldflags"

SYSTEMD_PACKAGES = "${@bb.utils.contains('DISTRO_FEATURES','systemd','${PN}','',d)}"
SYSTEMD_SERVICE_${PN} = "${@bb.utils.contains('DISTRO_FEATURES','systemd','telegraf.service','',d)}"
SYSTEMD_AUTO_ENABLE_${PN} = "enable"

do_install(){
    if ${@bb.utils.contains('DISTRO_FEATURES','systemd','true','false',d)}; then
        install -d ${D}${systemd_unitdir}/system
        install -m 0644 ${S}/src/${GO_IMPORT}/scripts/telegraf.service ${D}${systemd_unitdir}/system/
    fi
    install -d ${D}${bindir}
    install -m 0755 ${S}/bin/telegraf ${D}${bindir}/
    install -d ${D}${sysconfdir}/telegraf/scripts
    install -m 0644 ${WORKDIR}/telegraf.conf ${D}${sysconfdir}/telegraf/
    install -m 0755 ${WORKDIR}/telegraf-xentop.py ${D}${sysconfdir}/telegraf/scripts/
    install -d ${D}${sysconfdir}/logrotate.d
    install -m 0644 ${S}/src/${GO_IMPORT}/etc/logrotate.d/telegraf ${D}${sysconfdir}/logrotate.d/
    rm -rf ${S}/*
}