(ns user
  (:require [mount.core :as mount]
            films-club-clojure.core))

(defn start []
  (mount/start-without #'films-club-clojure.core/repl-server))

(defn stop []
  (mount/stop-except #'films-club-clojure.core/repl-server))

(defn restart []
  (stop)
  (start))


