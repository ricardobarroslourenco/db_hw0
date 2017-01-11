package uchidb;

import java.util.*;

/**
 * @author rlourenco
 */


public class HW0Runner {

    private static class localInstance implements Containers<Integer, String> {
        private static Map<String, Integer> bufferMap = null;

        @Override
        public Set initSet(Integer[] tArray) {
            return new HashSet<Integer>(Arrays.asList(tArray));
        }

        @Override
        public List initList(Integer[] tArray) {
            return new ArrayList<Integer>(Arrays.asList(tArray));
        }

        @Override
        public Map<String, Integer> initEmptyMap() {
            return new HashMap<String, Integer>();
        }


        @Override
        public void storeMap(Map<String, Integer> mapToStoreInClass) {
            bufferMap = mapToStoreInClass;
        }


        @Override
        public boolean addToMap(String key, Integer value, boolean overwriteExistingKey) {
            Integer pointer = bufferMap.put(key, value);
            if (pointer != null && overwriteExistingKey == true) {
                return false;
            } else {
                return true;
            }
        }

        @Override
        public Integer getValueFromMap(String key) {
            return bufferMap.get(key);
        }

        @Override
        public Integer getValueFromMap(String key, Integer defaultValue) {
            Integer bufferValue = bufferMap.get(key);
            if (defaultValue != null) {
                return bufferValue;
            } else {
                return defaultValue;
            }
        }
    }

    private static localInstance locInstance = new localInstance();

    public static Containers<Integer, String> getContainers() {
        return locInstance;
    }

    public static void main(String[] args) {
        try {
            getContainers();
        } catch (Exception e) {
            System.out.println("Error : " + e);
        }
    }

}