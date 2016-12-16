(ns fruit-cart.core
(use [fruit-cart.file.parse-list])
(use [fruit-cart.pick.pick])
  (:gen-class))

(defn -main
  "A function that creates produce names."
  [& args]
  (println (pick-one (parse-list "sizes"))
           (pick-one (parse-list "countries"))
           (pick-one (parse-list "adjectives"))
           (pick-one (parse-list "fruit")))
)

