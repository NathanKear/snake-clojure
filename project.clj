(defproject snake "0.1.0"
  :description "classic snake game, it uses swing for gui"
  :dependencies [[org.clojure/clojure "1.10.0"]]
  :main ^:skip-aot snake.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})