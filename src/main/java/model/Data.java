package model;

public class Data {
    private String word;
    private String type;
    private String meaning;
    private String example;
//    private  boolean isActive = false;

    public Data(String word, String type, String meaning, String example) {
        this.word = word;
        this.type = type;
        this.meaning = meaning;
        this.example = example;
    }

    public String getWord() {
        return word;
    }

    public String getType() {
        return type;
    }

    public String getMeaning() {
        return meaning;
    }

    public String getExample() {
        return example;
    }

//    public boolean isActive() {
//        return isActive;
//    }

    public void setWord(String word) {
        this.word = word;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }

    public void setExample(String example) {
        this.example = example;
    }

//    public void setActive(boolean isActive) {
//        this.isActive = isActive;
//    }
//    
//    public void setIsDeleted(boolean isDeleted) {
//        this.isActive = !isDeleted;
//    }

    @Override
    public String toString() {
        return "Word: " + word + "\nType: " + type + "\nMeaning: " + meaning + "\nExample: " + example;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Data that = (Data) obj;
        return 
               word.equals(that.word) && 
               type.equals(that.type) && 
               meaning.equals(that.meaning) && 
               example.equals(that.example);
    }

    @Override
    public int hashCode() {
        int result = word.hashCode();
        result = 31 * result + type.hashCode();
        result = 31 * result + meaning.hashCode();
        result = 31 * result + example.hashCode();
        return result;
    }

    void setMean(String meaning) {
        this.meaning = meaning;
    }

    public String getEnglish() {
        return this.word;
    }

}
