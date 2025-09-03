import React from 'react';
import ReactDOM from 'react-dom';
import { BrowserRouter as router } from 'react-router-dom';
import { useState } from 'react';
import AddCustomer from './addCustomer';
import Count from './count';
import ViewCustomer from './viewCustomer';
import { Provider } from 'react-redux';
import { store } from '../store/store';

export default function Customer (){
    return(<div>
        Customer Details Section.
        <Provider store={store}>
            <AddCustomer/>
            <ViewCustomer/>
            {/* <Count/> */}
        </Provider>
    </div>);
};