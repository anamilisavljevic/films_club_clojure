(ns films-club-clojure.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[films_club_clojure started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[films_club_clojure has shut down successfully]=-"))
   :middleware identity})
