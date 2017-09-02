(ns films-club-clojure.env
  (:require [selmer.parser :as parser]
            [clojure.tools.logging :as log]
            [films-club-clojure.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[films_club_clojure started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[films_club_clojure has shut down successfully]=-"))
   :middleware wrap-dev})
