(ns fruit-cart.core
(require fruit-cart.fruit.fruit-list)
(refer fruit-cart.fruit.fruit-list)
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println (fruits)))
