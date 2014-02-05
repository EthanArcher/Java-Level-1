package com.black.Prac16;

class ContactDetails
{
	// declare properties

    String name, homeAddress, homeTel, workTel, mobile;

	// define constructor method

    public ContactDetails(String name, String homeAddress, String homeTel, String workTel, String mobile)
    {
        this.name = name;
        this.homeAddress = homeAddress;
        this.homeTel = homeTel;
        this.workTel = workTel;
        this.mobile = mobile;
    }

	public void printDetails()
	{
        if (! name.equals(""))
        {
            System.out.println("Name : " + name);

        }

        if (! homeAddress.equals(""))
        {
            System.out.println("Home Address : " + homeAddress);

        }

        if (! homeTel.equals(""))
        {
            System.out.println("Home Telephone : " + homeTel);

        }

        if (! workTel.equals(""))
        {
            System.out.println("Work Telephone : " + workTel);

        }

        if (! mobile.equals(""))
        {
            System.out.println("Mobile Telephone : " + mobile);

        }



	}



}