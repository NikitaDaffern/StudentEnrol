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

       def student1=new Student(
       name: 'Nikita Daffern',
       studentID: '26029665',
       dob: new Date('11/09/1997'),
       email: 'b6029665@my.shu.ac.uk',
       username: 'b6029665',
       password: 'dhuiwy733u8d',
       isFundingAvailable: 'true',
       course: 'Computing').save()

       def student2=new Student(
       name: 'Tatjana Cerniha',
       studentID: '24028765',
       dob: new Date('11/09/1994'),
       email: 'b4028765@my.shu.ac.uk',
       username: 'b4028765',
       password: 'hdk01234209hu',
       isFundingAvailable: 'true',
       course: 'Computing').save()


       def databases=new Module(
       title: 'Databases',
       code: 'DB123',
       credits: '40',
       lecturer: 'Lynne Dawson',
       course: 'Computing',
       description: 'lorem ipsum').save()

       def lecturer1=new Lecturer(
       fullName: 'Lynne Dawson',
       post: 'Lecturer',
       subject: 'Databases',
       lecturerEmail: 'lynnedawson@shu.ac.uk',
       office: '9407',
       bio: 'Databases lecturer').save()

}
    def destroy = {
    }
}
