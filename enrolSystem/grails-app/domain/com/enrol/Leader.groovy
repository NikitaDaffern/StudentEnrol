package com.enrol

class Leader {

String fullName

String department

String subject

String leaderEmail

String username

String password

String office

String bio

String toString(){

return fullName

}

    static constraints = {

fullName blank:false, nullable:false

department blank:false, nullable:false

subject blank:false, nullable:false

leaderEmail blank:false, nullable:false, email:true, unique:true

username blank:false, nullable:false, unique:true

password blank:false, nullable:false

office blank:false, nullable:false

bio blank:false, nullable:false, maxSize:5000, widget:'textarea'
    }
}
