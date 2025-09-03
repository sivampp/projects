import React from "react";
import App from "../App";
import '../App.css';
import { Sidemenu } from "./sidemenu";
import { Route, Routes, BrowserRouter  as Router } from 'react-router-dom';
import Customer from "../cus/customer";
import Product from "../prd/product";
import Order from "../ord/order";

function Sidebar(){
    
    return(
        
        <div className="sidebar">
            {console.log(Sidemenu.length)}
            <ul className="ul">
                {
                    Sidemenu.map((val, key) => {
                        return(
                        <li key={key}
                                onClick={() => {
                                    window.location.pathname=val.link
                                }} >
                                    {" "}
                                    <div>{val.icon}</div>
                                    <div className='sideMenu'>{val.title}</div>
                        </li>)
                    })
                }
            </ul>
        </div>
        );
    
    // return(<div className="Sidebar">
    //     <ul>
    //         {Sidemenu.map((val, key) => {
                
                    
    //                 <li key={key} onClick=(() => {
    //                     window.location.pathname = val.link
    //                     }) 
    //                 >
    //                     {""}
    //                     <div>{val.icon}</div>
    //                     <div>{val.title}</div>
    //                 </li>
                   
    //             );
    //         })}
    //     </ul>
    // </div>);
} export default Sidebar;
