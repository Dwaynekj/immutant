(defproject org.immutant/immutant-daemons-module "1.0.3-SNAPSHOT"
  :parent [org.immutant/immutant-modules-parent _ :relative-path "../pom.xml"]
  :plugins [[lein-modules "0.1.0"]
            [org.immutant/build-plugin "0.1.0-SNAPSHOT"]]
  :dependencies [[org.immutant/immutant-common-module _]
                 [org.immutant/immutant-core-module _]
                 [org.projectodd/polyglot-core _]
                 [org.jboss.as/jboss-as-jmx _]])
