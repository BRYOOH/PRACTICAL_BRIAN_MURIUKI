using ASP.NET.Models;
using Microsoft.EntityFrameworkCore;

namespace ASP.NET.Context
{
    public class ApplicationDbContext(DbContextOptions<ApplicationDbContext> contextOptions) : DbContext(contextOptions){
        //create a table Student
        public DbSet<Student> Form1a{get;set;}
        public DbSet<Student> Form1b{get;set;}
        public DbSet<Student> Form1c{get;set;}
    }

}