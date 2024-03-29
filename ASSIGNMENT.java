ASSIGNMENT 
Data Type	Size	Range
byte	1 byte	-128 to 127
short	2 bytes	-32,768 to 32,767
int	4 bytes	-2,147,483,648 to 2,147,483,647
long	8 bytes	-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
float	4 bytes	Approximately ±3.40282347×1038
double	8 bytes	Approximately ±1.7976931348623157×10308
char	2 bytes	0 to 65,535 (Unicode characters)
boolean	1 bit	true or false
This table includes the eight primitive data types in Java, their size in memory, and the range of values they can store123. Remember that float and double are approximate ranges due to the way floating-point numbers are stored.public class TestDog {
        public static void main(String args[]) {
                    // Create an object of the Dog class
                            Dog myDog = new Dog();

                                  
                                  
                                  
                                  
                                  
                                    // Access the object's field and method
                                            myDog.breed = "Beagle";
                                                    myDog.bark(); // Outputs: Woof!
        }
}

        }
}