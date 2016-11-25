# ThreadSafe-about-Servlet
Servlet is not thread safe; BUT when I use Mozilla to test doGet() and doPost(), it becomes thread safe.
To solve it, two browsers are needed, the other one could be chrome or IE, not Mozilla.
OR test it on IE, Mozilla does not support concurrent in the two same http requestsce.

Second, if I overwrite the service(); it seems to be ok to run both on Mozilla. I don't know the reason~
