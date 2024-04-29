import React from "react";
import "./Header.css";
import logo from '../../assets/FullAdoptDifferentlyLogo.png';
import {Nav} from 'react-bootstrap';
import {Link} from 'react-router-dom';
import {NavLink, BrowserRouter} from 'react-router-dom';


export const Header = () => {
    return <div>
        <header className="header">
            <img src={logo} alt="Adopt Differently Logo" className="logo"/>
            <BrowserRouter>
                <nav id= "nav-tabs">
                <ul className="header-top-menu">
                    <li>
                        <Nav defaultActiveKey={'/'} >
                            <NavLink className={({ isActive, isPending }) => isPending ? "pending" : isActive ? "active" : ""} to="/">Home</NavLink>
                        </Nav>
                    </li>
                    <li>
                        <NavLink className={({ isActive, isPending }) => isPending ? "pending" : isActive ? "active" : ""} to="/about">About</NavLink>
                    </li>
                    <li>
                        <NavLink className={({ isActive, isPending }) => isPending ? "pending" : isActive ? "active" : ""} to="/help">Help</NavLink>
                    </li>
                </ul>
                </nav>
                <div className="header-top-right">
                    <div className="signin">
                        <li>
                            <Link to="/signin">signin</Link>
                        </li>
                    </div>
                    <div className="signup">
                        <li>
                            <Link to="/signup">signup</Link>
                        </li>
                    </div>
                </div>
            </BrowserRouter>
        </header>
    </div>
}