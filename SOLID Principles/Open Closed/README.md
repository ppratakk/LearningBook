# OCP - Open Closed Principle
> *Software entities (classes, modules, functions, etc.) should be open for extension, but closed for modification*


1.  “_Open for extension_  “: This means that the behavior of a software module, say a class can be extended to make it behave in new and different ways. It is important to note here that the term “_extended_” is not limited to inheritance using the Java `extend` keyword. As mentioned earlier, Java did not exist at that time. What it means here is that a module should provide extension points to alter its behavior. One way is to make use of  [Polymorphism](https://www.w3schools.com/java/java_polymorphism.asp)  to invoke extended behaviors of an object at run time.

2.  “_Closed for modification_“: This means that the source code of such a module remains unchanged.