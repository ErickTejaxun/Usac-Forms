
SET JAVA_HOME="C:\Program Files\Java\jdk1.8.0_31\bin" 
SET PATH=%JAVA_HOME%;%PATH% 
SET CLASSPATH=%JAVA_HOME%; 
SET JFLEX_HOME= C:\LibreriasJava\javacc-6.0\bin\lib
cd C:\Users\erick\Documents\Compi2\2018S2\Proyecto1\GeneradorFormularios\src\Analizadores
java -cp %JFLEX_HOME%\javacc.jar javacc gramatica.jj
