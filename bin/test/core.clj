(println "Please enter the length of your rod in mm.")
(def rodlength (read-string (read-line)))
(println "Please enter the thickness of your rod in mm")
(def rodthick (read-string (read-line)))
(defn volume 
  [x y] 
  (* 0.25 3.14 x x y))
(def rodvolume (volume rodlength rodthick))
(println "Please enter the desired thickness of the stringer in mm.")
(def stringthick (read-string (read-line))) 
(defn stringlength
  [x y]
  (/ x 0.25 3.14 y y))
(println "You can pull" (stringlength rodvolume stringthick) "mm of stringers")