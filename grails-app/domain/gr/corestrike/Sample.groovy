package gr.corestrike

class Sample {
    static mapWith = "redis"
    
    String key;
    String value;
    
    static constraints = {
        key blank:false
        value blank:false
    }
    
    static mapping = {
        key index:true
    }
}
