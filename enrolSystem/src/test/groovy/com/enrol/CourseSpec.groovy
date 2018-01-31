package com.enrol

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class CourseSpec extends Specification implements DomainUnitTest<Course> {

    def setup() {
    }

    def cleanup() {
    }

    void totalFees() {

when:"A Course has title and fees"

def computing=new Course(title:'BSc Hon Computing',
                     
                   fees:9500)


then:"The calculateFees method will total fees "

computing.calculateFees()==36000
        
    }
}
