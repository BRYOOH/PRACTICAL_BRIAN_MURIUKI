
using System.ComponentModel.DataAnnotations;

namespace ASP.NET.Models
{
    public class StudentData
    {

        [Required]
        public string studentName { get; set; } = "";

        [Required]
        public string adminNo { get; set; } = "";
    }
}