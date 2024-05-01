// Adopt-Differently-Frontend/ad_frontend_ui/src/App.jsx
import './App.css'
import { Header } from './components/header/Header'
import { Footer } from './components/footer/Footer'
import { BrowserRouter, Routes, Route } from 'react-router-dom'
import { Listings } from './components/listing/Listings'
import { Home } from './pages/home/Home'
import { About } from './pages/about/About'

function App() {
  return (
    <div className="App">
      <BrowserRouter>
          <div>
            <Header />
            <p>meow meow</p>
            <Routes>
              <Route path="/" element={<Home />} />
              <Route path="/adopt" element={<Listings />} />
              <Route path="/about" element={<About />} />
            </Routes>
          </div>
          <Footer />
      </BrowserRouter>
    </div>
  )

}
export default App
