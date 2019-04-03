using System;
using System.Diagnostics;
using System.IO;
using System.Reflection;
using System.Reflection.Emit;

namespace HelloWorld
{
    class Program
    {
        static void Main(string[] args)
        {
            var name = "MerhabaDunya.exe";
            var assemblyname = new AssemblyName(name);
            var assemblybuilder = AppDomain.CurrentDomain.DefineDynamicAssembly(assemblyname, AssemblyBuilderAccess.RunAndSave);
            var modulebuilder = assemblybuilder.DefineDynamicModule(name);
            var program = modulebuilder.DefineType("Program", TypeAttributes.Public);

            var mainmethod = program.DefineMethod("Main", MethodAttributes.Public | MethodAttributes.Static, null, new Type[] { typeof(string[]) });

            var ilgenerator = mainmethod.GetILGenerator();

            ilgenerator.Emit(OpCodes.Ldstr, "Merhaba Dunya!");
            ilgenerator.Emit(OpCodes.Call, (typeof(Console)).GetMethod("WriteLine", new Type[] { typeof(string) }));
            ilgenerator.Emit(OpCodes.Call, (typeof(Console)).GetMethod("ReadKey", new Type[0]));
            ilgenerator.Emit(OpCodes.Pop);
            ilgenerator.Emit(OpCodes.Ret);

            program.CreateType();

            assemblybuilder.SetEntryPoint(((Type)program).GetMethod("Main"));

            File.Delete(name);

            assemblybuilder.Save(name);

            Process.Start(name);
        }
    }
}
