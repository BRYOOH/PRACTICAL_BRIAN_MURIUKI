using System.Data.SqlClient;
using ASP.NET.Models;
using Microsoft.AspNetCore.Mvc;


namespace ASP.NET.Controllers
{
    [ApiController]
    [Route("api/[controller]")]
    public class StudentController : ControllerBase
    {
        private readonly string connnectionString;

        public StudentController(IConfiguration configuration)
        {
            connnectionString=configuration["ConnectionStrings:Default"]??"";
        }

        [HttpPost]
        public IActionResult CreateStudent(StudentData studentData)
        {
            try
            {
                using (var connection= new SqlConnection(connnectionString))
                {
                    connection.Open();

                    string sql = " INSERT INTO Form1a" + "(userName,adminNo) VALUES" + "(@userName, @adminNo)";

                    using (var command = new SqlCommand(sql,connection))
                    {
                        command.Parameters.AddWithValue("@studentName",studentData.studentName);
                        command.Parameters.AddWithValue("@adminNo",studentData.adminNo);

                        command.ExecuteNonQuery();
                    }
                }
            }
            catch (Exception )
            {
                ModelState.AddModelError("Student", "Sorry, but we have an error");
                return BadRequest(ModelState);
                
            }

            return Ok();
        }
    }
}