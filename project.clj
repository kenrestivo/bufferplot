(defproject bufferplot "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [incanter "1.5.5"]]
  :plugins [[lein-bin "0.3.4"]]
  :bin {:name "bufferplot"}
  :main  bufferplot.core
  :profiles {:uberjar {:aot :all}})
