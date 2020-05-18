(defun big-and-small (a-number)
    (if (< a-number 0.5)
        (progn 
            (princ "value:")
            (princ a-number)
            (princ " result:Small")
        )
        (progn 
            (princ "value:")
            (princ a-number)
            (princ " result:Big")
        )
    )
)

(big-and-small (random 1.0))
