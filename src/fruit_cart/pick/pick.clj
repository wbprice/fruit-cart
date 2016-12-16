(ns fruit-cart.pick.pick)

(defn pick-one
  "Given a vector, picks four items randomly."
  [things]
  (get things (rand-int (count things))))
