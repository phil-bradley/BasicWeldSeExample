The purpose of this code is to demonstrate a basic "hello world" style scenario using CDI in Java SE. In this case, the application is using weld-se to provide CDI. The program uses weld to fetch a singleton and invoke one of its' business methods "doStuff()". 

Note the presence of src/main/resources/META-INF/beans.xml. This file is empty but without it, the CDI engine won't work.
