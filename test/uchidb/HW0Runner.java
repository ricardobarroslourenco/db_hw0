package uchidb;
import java.util.*;

/**
 * @author rlourenco
 */

abstract class HW0Runner implements Containers {

	private static Map<String,Integer> bufferMap = null;

	//TODO you likely will need to add member variable
	//TODO olhar o overrride de classe pois implementa inteiros ou strings ao inves de objetos presentes nos containers...

	// This class is a factory for a singleton containers class.
	// https://www.tutorialspoint.com/java/java_using_singleton.htm
	public static Containers<Integer, String> getContainers() {
		// TODO fix this function

		return null;
	}

	// Initialize Objects

	//@Override
	public Set initSet(Integer tArray) {
		return new HashSet<Integer>(Arrays.asList(tArray));
	}

	//@Override
	public List initList(Integer tArray) {
		return new ArrayList<Integer>(Arrays.asList(tArray));
	}

	@Override
	public Map <String,Integer> initEmptyMap() {
		return new HashMap<String,Integer>();
	}




	//@Override
	public storeMap(Map<String,Integer> inputMap) {
		bufferMap = inputMap;
	}



	//@Override
	public boolean addToMap(String key, Integer value, boolean overwriteExistingKey)
	{
		Integer pointer = bufferMap.put(key, value);
		if (pointer != null && overwriteExistingKey == true){
			return false;
		}
		else
		{
			return true;
		}
	}

	//@Override
	public Integer getValueFromMap(String key)
	{
		return bufferMap.get(key);
	}

	//@Override
	public Integer getValueFromMap(String key, Integer defaultValue)
	{
		Integer bufferValue = bufferMap.get(key);
		if(defaultValue != null){
			return bufferValue;
		}
		else {
			return defaultValue;
		}
	}


	public static void main(String[] args){

		//System.out.println("Teste");
	}
}
