package be.abis.courseadmin.repository;

import be.abis.courseadmin.model.Company;

public class MemoryArrayCompanyRepository implements CompanyRepository {

    Company c1 = new Company("Abis", 1);
    Company c2 = new Company("Smals", 2);
    Company c3 = new Company("Intel", 3);
    Company c4 = new Company("FCL", 4);
    Company c5 = new Company("MLTF", 5);

    Company[] companies = {c1, c2, c3, c4, c5};

    public Company findCompany(int id){
        for (Company c: companies){
            if (c.getCompanyNumber()==id) {
                return c;
            }
        }
        return null;
    }

    public Company findCompany(String name){
        for (Company c: companies){
            if (c.getName().equals(name)) {
                return c;
            }
        }
        return null;
    }

    public void addCompany(Company c){

    }
    public void updateCompany(Company c){

    }
    public void deleteCompany(int id){

    }

}
