package Task1;

import java.util.Map;

class Animal {

    private String title;
    private boolean isAvailable;
    private boolean isSold;
    private Map<String, String> photosMap;

    public String toString() {

        return "title:" + title + " isAvailable:" + isAvailable + " photomap:" + photosMap;
    }
}
