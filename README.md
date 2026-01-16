# CSCI271_Grade_Calculator
This repository is used in calculating the grade for a class I'm in this semester (Spring 2026). The way in which this grade is calculated is based on four variables being used in a scalar-valued piecewise function to produce a final grade, tending to add more emphasis to the weights if one does well on the exams. This calculator aims to simplify and scale the function for use throughout the course.
# The Calculation
Let $G$ be the final grade of the course, and let $E$ be the total exam score, given by 

$$E=\frac{0.4F+0.2M+0.1T}{70},$$

where $F$ is the final exam score, $M$ is the final midterm grade, and $T$ is the average in-class test score.

This is then put into a piecewise function $G$,

$$G=\begin{cases}
  E \quad E<60\\
  (1-W)E+WA \quad 60\leq E <80\\
  0.4F+0.2M+0.1T+0.3A \quad E\geq 80
\end{cases}$$

Where $A$ is the average score of assignments and $W=0.3(E-60)/20$.
