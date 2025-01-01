package Advance_Java;

/**
 * providing info about the JavaDoc Method tags for better understanding
 */

/**
 * This class is to demonstrate what javaDoc is and how it is used in the java industry
 * This is <i>italic</i> word<p>this is new paragraph</p>
 * @author Dipak patil
 * @version 7.00
 * @since 2003
 @see <a href="https://docs.oracle.com/en/java/javase/14/docs/api/index.html" target="_blank">Java Docs</a>
 */

/*
Javadocs: Method Tags For Generating java Documentation

JavaDoc tags :

Tag	                  Syntax                                                       Description

 @author    ->        @author name-text	                       ->                Describes the author of a class.
 @version   ->	      @version version-number                  ->	             Adds a "Version" heading which specifies the current version of the release or file.
 @since     ->	      @since release-date	                   ->                Adds a "Since" heading that tells about the release date.
 @see	    ->        @see <a href="reference"></a>            ->                Adds a "See Also" heading that refers to the other element of the documentation.
 @return    ->	      @return return-description	           ->                Adds a "Return" description that tells about the return value of the method.
 @param	    ->        @param param-description	               ->                Provides the information about the method parameters in the "Parameters" section.
 @throws    ->	      @exception exception-name description    ->	             Displays the exception that can be thrown by a method ( same as @exception)
 {@code}    ->	      {@code text}	                           ->                Displays text in code font without interpreting the text as HTML markup or nested javadoc tags.
 @deprecated->        @deprecated	@deprecated deprecatedtext ->	             Adds a "Deprecated" heading indicating that this API should no longer be used.
 */

public class CWH_107_JavaDoc_MethodTags {
    /**
     *
     * @param args These are argument supplied to the command line
     */
    public static void main(String[] args) {
        System.out.println("This is main method");
    }

    /**
     *
     * @param i This is first number to add
     * @param j This is second number to add
     * @return Sum of two number as an integer
     * @throws Exception if i is 0
     * @deprecated This method is deprecated please use + operator
     */
        public int add(int i,int j) throws Exception{
            if(i==0){
                throw new Exception();
            }
            int c;
            c = i + j;
            return c;
    }
}
