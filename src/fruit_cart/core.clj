(ns fruit-cart.core
(use [fruit-cart.fruit.fruit-list])
(use [fruit-cart.pick.pick-four])
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println (pick-one (fruits))))

