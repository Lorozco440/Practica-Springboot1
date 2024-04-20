package com.umg.service;
import org.springframework.beans.factory.annotation.Autowired;



@Service
public class StudentService {
	@Autowired
	StudentRepository studentRepository;
	
	public ResponseEntity<List<Student>> getAllStudents(){
		return new ResponseEntity<>(studentRepository.findAll(), HttpsStatus.OK);
	}
	
	public ResponseEntity<?> getStudent(Long id){
		Optional<Student> student = studenRepository.findById(id);
		if(student.isPresent()) {
			return new ResponseEntity<>(student, HttpStatus.OK) ;
		}
		else {
			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND) ;
		}
	}
	
	{

		StudentValidator.studentValidator(student);
		studentRepository.save (student);
		Optional<Student> newStudent = studentRepository. findById (student.getId());
		if(newStudent. isPresent () )
		{

		}
		ErrorSource errorSource = new ErrorSource("Error de registro","Error al crear
		return new ResponseEntity<>(errorSource, HttpStatus. INTERNAL_SERVER_ERROR) ;

		public ResponseEntity <? > createStudent (Student student)

		try

		return new ResponseEntity<>(newStudent.get(), HttpStatus. CREATED) ;

		{

		}

		}
		catch (ValidationException ex)

		ErrorSource errorSource = new ErrorSource("Invalido ingreso", ex. getMessage() );
		return new ResponseEntity<>(errorSource, HttpStatus.BAD_REQUEST);

		}

}
