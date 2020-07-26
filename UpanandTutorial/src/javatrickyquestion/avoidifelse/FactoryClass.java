package javatrickyquestion.avoidifelse;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class FactoryClass {
  static   Map<String,Operator> operatorMap = new HashMap<>();
    static {
        operatorMap.put("add",new ImplementAddition());
        operatorMap.put("subtract" , new ImplementSubtration());
        operatorMap.put("multiply" , new ImplementMultiplication() );
    }

    static Optional<Operator> optionalOperator(String operation){
        Optional<Operator> operator = Optional.ofNullable(operatorMap.get(operation));
        return operator;
    }
}
