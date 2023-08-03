package new_features_java8_to_java17;

import java.util.List;

class AdvancedOverloaded {
//	public void method(Iterable iterable){}
//	public int method(Iterable iterable){ return 100;}
	public void method(List<String> list) {}
//	public void method(String string) {}
	public int method(String string){
		var variable = 200;
		return variable;
	}
//	var cannot be used in method signature (return type and parameters)
//	public var method(String string){
//		var variable = 200;
//		return variable;
//	}
}