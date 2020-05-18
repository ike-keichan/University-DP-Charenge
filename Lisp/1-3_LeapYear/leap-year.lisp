(defun leap-year (year)
    (if (and (= (rem year 4) 0) 
            (or (not (= (rem year 100) 0)) 
                (= (rem year 400) 0)
            )
        ) 
        (progn 
            (princ year) 
            (princ "は閏年です。")
        )
        (progn 
            (princ year) 
            (princ "は閏年ではありません。")
        )
    )
)

(leap-year (read))
