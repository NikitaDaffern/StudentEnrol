package com.enrol

class BootStrap {


    def init = { servletContext ->

       def leader1=new Leader(
       fullName: 'Dr Tom Donaldson',
       department: 'Computing',
       subject: 'Web Development',
       leaderEmail: 'TDonaldson@shu.ac.uk',
       username: 'TDonaldson46738',
       password: 'dkjdhk6493bd',
       office: '6547',
       bio: 'lorem ipsum').save()

       def leader2=new Leader(
       fullName: 'Jane Doe',
       department: 'Computing',
       subject: 'Games Development',
       leaderEmail: 'JDOE@shu.ac.uk',
       username: 'jDoe86372',
       password: 'dkdsk62891hd8',
       office: '9328',
       bio: 'lorem ipsum').save()

       def leader3=new Leader(
       fullName: 'Mike Jones',
       department: 'Computing',
       subject: 'Web Design',
       leaderEmail: 'MJones@shu.ac.uk',
       username: 'MJones83627',
       password: 'kshikss839his',
       office: '9275',
       bio: 'lorem ipsum').save()

       def course1=new Course(
       department: 'Computing',
       code: 'CS123',
       title: 'BSc Hon Computing',
       leader: leader3,
       startDate: new Date('09/09/2018'),
       endDate: new Date('07/07/2018'),
       numberOfStudents: '55',
       studyMode: 'FullTime',
       tuitionFees: '9000.00',
       description: 'LOREM IPSUM').save()
    
       def course2=new Course(
       department: 'Computing',
       code: 'GD123',
       title: 'BSc Hon Games Development',
       leader: leader2,
       startDate: new Date('09/09/2018'),
       endDate: new Date('07/07/2018'),
       numberOfStudents: '40',
       studyMode: 'FullTime',
       tuitionFees: '9000.00',
       description: 'LOREM IPSUM').save()


       def course3=new Course(
       department: 'Computing',
       code: 'SD123',
       title: 'BSc Hon Software Development',
       leader: leader1,
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
       course: course1).save()

       def student2=new Student(
       name: 'Tatjana Cerniha',
       studentID: '24028765',
       dob: new Date('11/09/1994'),
       email: 'b4028765@my.shu.ac.uk',
       username: 'b4028765',
       password: 'hdk01234209hu',
       isFundingAvailable: 'true',
       course: course2).save()

       def student3=new Student(
       name: 'Bafrin Fattahi',
       studentID: '24294865',
       dob: new Date('22/04/1990'),
       email: 'b4294865@my.shu.ac.uk',
       username: 'b4294865',
       password: 'hdjdhq679hiwq982',
       isFundingAvailable: 'true',
       course: course3).save()

       def lecturer1=new Lecturer(
       fullName: 'Lynne Dawson',
       post: 'Lecturer',
       subject: 'Databases',
       lecturerEmail: 'lynnedawson@shu.ac.uk',
       office: '9407',
       bio: 'Databases lecturer').save()

       def lecturer2=new Lecturer(
       fullName: 'Tonderai Maswera',
       post: 'Senior Lecturer',
       subject: 'System Architectures',
       lecturerEmail: 'TonderaiMaswera@shu.ac.uk',
       office: '9427',
       bio: 'System Architectures lecturer').save()

       def lecturer3=new Lecturer(
       fullName: 'Lynn Cinderey',
       post: 'Lecturer',
       subject: 'Information Systems',
       lecturerEmail: 'lynnCinderey@shu.ac.uk',
       office: '9423',
       bio: 'Information Systems lecturer').save()

       def module1=new Module(
       title: 'Databases',
       code: 'DB123',
       credits: '40',
       lecturer: lecturer1,
       description: 'lorem ipsum').save()

       def module2=new Module(
       title: 'System Architectures',
       code: 'SA123',
       credits: '60',
       lecturer: lecturer2,
       description: 'lorem ipsum').save()

       def module3=new Module(
       title: 'Programming',
       code: 'PR123',
       credits: '40',
       lecturer: lecturer3,
       description: 'lorem ipsum').save()

       

   
lecturer1.addToModules(module1)
lecturer1.addToModules(module3)
lecturer2.addToModules(module2)
lecturer3.addToModules(module1)

course1.addToLecturers(lecturer1)
course2.addToLecturers(lecturer3)
course3.addToLecturers(lecturer2)

lecturer1.addToCourses(course2)
lecturer2.addToCourses(course3)
lecturer3.addToCourses(course1)

course1.addToStudents(student1)
course2.addToStudents(student3)
course2.addToStudents(student2)
course3.addToStudents(student1)

module2.addToCourse(course1)
module1.addToCourse(course3)
module3.addToCourse(course2)

module1.addToStudents(student1)
module2.addToStudents(student2)
module3.addToStudents(student3)

student1.addToModules(module1)
student1.addToModules(module2)
student2.addToModules(module1)
student2.addToModules(module3)
student3.addToModules(module2)
student3.addToModules(module3)



}
    def destroy = {
    }
}
