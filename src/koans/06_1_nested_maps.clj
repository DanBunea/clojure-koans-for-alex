(ns koans.06-1-nested-maps
  (:require [koan-engine.core :refer :all]))

(meditations
 "You can look up the value for a given path"
 (= __ (get-in {:x {:a 1 :b 2}} [:x :b]))

 "But you can provide your own default"
 (= __ (get-in {:x {:a 1 :b 2}} [:x :c] :key-not-found))

 "Change a nested non existing value"
 (= {:x {:a 1 :b 2 :c __}}  (assoc-in {:x {:a 1 :b 2}} [:x :c] 3))

 "Change a nested existing value"
 (= {:x {:a 1 :b 2 :c __}}  (assoc-in {:x {:a 1 :b 2 :c 0}} [:x :c] 5))

  "Change a nested non existing value"
 (= {:x {:a 1 :b 2 :c 2}
     :y __}  (assoc-in {:x {:a 1 :b 2}} [:y :c] 3))

)