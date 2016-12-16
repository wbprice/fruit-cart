(ns fruit-cart.file.parse-list
(use [clojure.java.io :as io]))

(defn parse-list
  [file]
  (clojure.string/split-lines (slurp (io/resource file))))

