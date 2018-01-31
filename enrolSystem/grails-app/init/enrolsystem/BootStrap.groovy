package com.enrol

class BootStrap {


    def init = { servletContext ->

       def computing=new Course(
       department: 'Computing',
       code: 'CS123',
       title: 'BSc Hon Computing',
       leader: 'Dr Michelle Murphy',
       startDate: new Date('09/09/2018'),
       endDate: new Date('07/07/2018'),
       numberOfStudents: '55',
       studyMode: 'FullTime',
       tuitionFees: '9000.00',
       description: 'LOREM IPSUM').save()
    
       def GamesDevelopment=new Course(
       department: 'Computing',
       code: 'GD123',
       title: 'BSc Hon Games Development',
       leader: 'Dr Michelle Murphy',
       startDate: new Date('09/09/2018'),
       endDate: new Date('07/07/2018'),
       numberOfStudents: '40',
       studyMode: 'FullTime',
       tuitionFees: '9000.00',
       description: 'LOREM IPSUM').save()


       def SoftwareDevelopment=new Course(
       department: 'Computing',
       code: 'SD123',
       title: 'BSc Hon Software Developemnt',
       leader: 'Dr Michelle Murphy',
       startDate: new Date('09/09/2018'),
       endDate: new Date('07/07/2018'),
       numberOfStudents: '35',
       studyMode: 'FullTime',
       tuitionFees: '9000.00',
       description: 'LOREM IPSUM').save()
}
    def destroy = {
    }
}
