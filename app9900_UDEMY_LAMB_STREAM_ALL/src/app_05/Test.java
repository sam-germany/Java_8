package app_05;

import java.util.function.Supplier;

class Document{
	void printAuthor() {
		System.out.println("Document Author");
	}
}
class RFP  extends Document{
	@Override
	void printAuthor() {
		System.out.println("RFP- Author");
	}
}
public class Test {
	public static void main(String[] args) {

        check(Document::new);
		check(RFP::new);
	}
	private static void check(Supplier<? extends Document> s    ) {
		s.get().printAuthor();
	}}
/*
Supplier<Document>          -----    this will work
Supplier<? extends Document>  --   and  this will also work, just remember in mind the Enthuware explanation
                                    for the  <? extends Document>  and  <? super Document>

Supplier<? super Document>  -- this will not work as we alloweed <? super Document>  when we try to use
                                .get()  method then it return   Object type



Supplier<RFP>   -----simple point   as Supplier<RFP>  type then how we can  .get(); call super class Document
                    check(RFP::new);  this works    but check(Document::new); it give us compilation error
 
Supplier<? extends RFP>  --   for this we are sure that check(Document::new);   this will give us compilation 
                                                                                                     error


Supplier<? super RFP>       ---  as we are using the  <? super RFP>     super keyword then  .get() method will
                                                                                      return Object type.

Supplier        -- if we use direct  raw type for Supplier then  it return  Object type same as we are having
                   issue with the    super keyword   so  we are not  to call .get() method.

*/         