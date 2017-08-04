package chapter3.child4.study1;

import java.util.Date;

public class InheritableThreadLocalExt extends InheritableThreadLocal {
	
	@Override
	protected Object initialValue() {
		return new Date().getTime();
	}

}
