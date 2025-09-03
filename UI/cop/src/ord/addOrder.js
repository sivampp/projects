import React from "react";
import ViewCustomer from "./viewCustomer";
import { useState, useEffect } from "react";
import { addCustomer as addCustomerAction } from "../store/customerSlice";
import { useDispatch } from "react-redux";

export default function AddOrder(){

    const [customer, setInput] = useState("");
    const [customers, setCustomers] = useState([]);
    const [custName, setCusName] = useState('Krishna');

    useEffect(() => {

        function addCustomer(){
            if(customer){
                setCustomers((preList)=>[...preList, customer])
                //console.log("Customer List  ",customers);
                setInput("");
            }
            else{
                return<div>Please enter Customer Name</div>
            }
        }
   }, [customers])

            // useEffect(() => {
            //     console.log("Customer ",customer);
            // }, [customers])
    


    return(<>
    <div>
        <h2>Add new Customer</h2>
        <input type='text' value={customer} onChange={(e) => setInput(e.target.value)}/>
        <button onClick={addCustomer} >Add</button>
        {/* <button onChange={setCustomers()}>Add</button> */}
    </div>
    <ViewCustomer custName={custName}/>
        </>
    );
}