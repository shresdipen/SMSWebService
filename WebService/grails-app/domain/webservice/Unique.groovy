package webservice

import org.apache.commons.lang.builder.HashCodeBuilder

class Unique implements Serializable{
    String unique1
    String unique2
    static constraints = {

    }

    boolean equals(other) {
        if (!(other instanceof Unique)) {
            return false
        }

        other.unique1 == unique1 && other.unique2 == unique2
    }
    int hashCode() {
        def builder = new HashCodeBuilder()
        builder.append unique1
        builder.append unique2
        builder.toHashCode()
    }
    static mapping = {
        datasource("test")
        id composite: ['unique1','unique2']
    }
}
