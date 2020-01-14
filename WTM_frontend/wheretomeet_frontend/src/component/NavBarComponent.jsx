import React, { Component } from 'react'
import { Nav, Navbar } from "react-bootstrap";
import AuthenticationService from '../service/AuthenticationService'

class NavBarComponent extends Component {
    render() {
        const isUserLoggedIn = AuthenticationService.isUserLoggedIn();

        return(
            <Navbar collapseOnSelect expand="lg" bg="dark" variant="dark" className="Navbar">
                <Navbar.Brand href="/">Where To Meet</Navbar.Brand>
                <Navbar.Toggle aria-controls="responsive-navbar-nav" />
                <Navbar.Collapse id="responsive-navbar-nav">
                    <Nav className="mr-auto">
                        <Nav.Link href="/aboutus">About Us</Nav.Link>
                    </Nav>
                    <Nav>
                        <Nav.Link href="/signup">Sign Up</Nav.Link>
                    </Nav>
                    <Nav>
                        {!isUserLoggedIn && <li><Nav.Link href="/">Login</Nav.Link></li>}
                        {isUserLoggedIn && <li><Nav.Link  href="/logout" onClick={AuthenticationService.logout}>Logout</Nav.Link></li>}
                    </Nav>
                </Navbar.Collapse>
            </Navbar>
           
        )
    }
}

export default NavBarComponent