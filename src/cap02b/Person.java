package cap02b;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Person {
	private List<Question> characteristics = new ArrayList<>();
	
	public void add(Question characteristic) {
		characteristics.add(characteristic);
	}
	
	public List<Question> getCharacteristics() {
		return characteristics;
	}
	
	public List<Question> withCharacteristic(String QuestionPattern){
		return characteristics
				.stream()
				.filter(c -> c.getText().endsWith(QuestionPattern))
				.collect(Collectors.toList());
	}
}
